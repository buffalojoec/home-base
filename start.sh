#!/bin/bash

source home_base.env

if [[ $1 == "clean" ]]; then
  mvn clean
fi

mvn spring-boot:run