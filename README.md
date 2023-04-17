# spring-cloud-k8s-demo
Demo project showcasing Spring Cloud Kubernetes


## Installing KIND
```shell
brew install kind

export KUBECONFIG=~/.kube/kind-config.yaml

kind create cluster --config k8s/kind-cluster.yml

kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/main/deploy/static/provider/kind/deploy.yaml

kubectl wait --namespace ingress-nginx \
  --for=condition=ready pod \
  --selector=app.kubernetes.io/component=controller \
  --timeout=90s
```

## To create or update feature flags
```shell
kubectl apply -f k8s/feature-flags-config-map.yml
```

## To build an image:
```./gradlew clean build bootBuildImage```

## To install/update helm chart
```helm repo add gruntwork https://helmcharts.gruntwork.io```

```helm  install -f k8s/k8s-service.yml spring-cloud-k8s-demo --repo https://helmcharts.gruntwork.io k8s-service --version v0.2.19  ```

```helm  upgrade -f k8s/k8s-service.yml spring-cloud-k8s-demo --repo https://helmcharts.gruntwork.io k8s-service --version v0.2.19  ```