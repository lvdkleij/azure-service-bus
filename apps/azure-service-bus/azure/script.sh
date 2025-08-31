resourceGroup="playground-1"
serviceBusNamespaceName="svcbus$RANDOM"
serviceBusQueueName="myqueue"

az deployment group create \
  --resource-group $resourceGroup \
  --template-file servicebus.bicep \
  --parameters serviceBusNamespaceName=$serviceBusNamespaceName \
  --parameters serviceBusQueueName=$serviceBusQueueName \
