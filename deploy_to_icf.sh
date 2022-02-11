#!/bin/bash

REGION="us-south"
RESOURCE_GROUP="Default"
FUNCTIONS_NAMESPACE="java-native-image-test"
ACTION_NAME="test"

# BUILD
NAME_BEFORE="micronautguide"
./gradlew dockerBuildNative
TAG=$(date +%s)
IMAGE="mwelke/openwhisk-java-native-image-test:${TAG}"
docker tag "${NAME_BEFORE}" "${IMAGE}"
docker push "$IMAGE"

# DEPLOY
ibmcloud target -r $REGION
ibmcloud target -g $RESOURCE_GROUP
ibmcloud fn namespace target $FUNCTIONS_NAMESPACE
# Do deploy using action update (aka create or update) command
ibmcloud fn action update $ACTION_NAME \
  --docker "${IMAGE}"
