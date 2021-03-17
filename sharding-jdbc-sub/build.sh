#!/bin/bash
#################### docker-compose初始化 ####################
docker-compose down
docker-compose build
docker-compose up -d

echo -e "\033[42;34m finish success !!! \033[0m"