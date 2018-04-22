http://www.widuu.com/chinese_docker/userguide/usingdocker.html

docker run ubuntu:14.04 /bin/echo 'Hello world'
Hello world

刚才你启动了你的第一个容器！


docker run -t -i ubuntu:14.04 /bin/bash
root@af8bae53bdd3:/#



docker version
Client:
 Version:       18.03.0-ce
 API version:   1.37
 Go version:    go1.9.4
 Git commit:    0520e24302
 Built: Fri Mar 23 08:31:36 2018
 OS/Arch:       windows/amd64
 Experimental:  false
 Orchestrator:  swarm

Server:
 Engine:
  Version:      18.04.0-ce
  API version:  1.37 (minimum version 1.12)
  Go version:   go1.9.4
  Git commit:   3d479c0
  Built:        Tue Apr 10 18:23:35 2018
  OS/Arch:      linux/amd64
  Experimental: false

  
docker port a3c5829e92c7 8080 查看外网8080到容器a3c5829e92c7映射到docker是那个端口
0.0.0.0:32768  
  
查看WEB应用程序日志
docker logs -f a3c5829e92c7

在主机上列出镜像列表
docker images

    docker ps 列出容器
    docker logs 显示容器的标准输出
    docker stop 停止正在运行的容器
