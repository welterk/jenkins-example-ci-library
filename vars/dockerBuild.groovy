#!/usr/bin/env groovy

def call() {
  return docker.build("welterk/jenkins-example-app")
}