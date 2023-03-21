# spring-cloud-k8s-demo
Demo project showcasing Spring Cloud Kubernetes


## Installing KIND
```shell
brew install kind
export KUBECONFIG=~/.kube/kind-config.yaml
kind create cluster
```

## To create or update feature flags
```shell
kubectl apply -f k8s/feature-flags-config-map.yml
```
