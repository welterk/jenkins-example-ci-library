#!/usr/bin/env groovy

def call() {
  app = docker.build("welterk/jenkins-example-app")
}