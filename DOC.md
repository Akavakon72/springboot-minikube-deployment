kubectl create deployment <Deployment name> --image=<image tag>
kubectl expose deployment <Deployment name> --type=NodePort --port=8080

## Demo steps can try
kubectl create deployment hello-minikube --image=akavakon72/springboot-minikube-deployment 
kubectl expose deployment hello-minikube --type=NodePort --port=8080

  
  
kubectl get services hello-minikube (if not M1)

The easiest way to access this service is to let minikube launch a web browser for you:

minikube service hello-minikube

Alternatively, use kubectl to forward the port:

kubectl port-forward service/<Deployment name> 7080:8080

Tada! Your application is now available at http://localhost:7080/.
