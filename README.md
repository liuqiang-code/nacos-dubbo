# 工程简介
该工程用于测试Dubbo微服务使用Nacos作为注册中心进行RPC调用时发生500异常，异常如下:

````
com.alibaba.nacos.api.exception.NacosException: failed to req API:zeus.powerdas.core.powercloud.com:20003/nacos/v1/ns/instance/list. code:500 msg: java.net.SocketTimeoutException: connect timed out
 at com.alibaba.nacos.client.naming.net.NamingProxy.callServer(NamingProxy.java:424)
 at com.alibaba.nacos.client.naming.net.NamingProxy.reqAPI(NamingProxy.java:451)
 at com.alibaba.nacos.client.naming.net.NamingProxy.reqAPI(NamingProxy.java:386)
 at com.alibaba.nacos.client.naming.net.NamingProxy.queryList(NamingProxy.java:297)
 at com.alibaba.nacos.client.naming.core.HostReactor.updateServiceNow(HostReactor.java:270)
 at com.alibaba.nacos.client.naming.core.HostReactor$UpdateTask.run(HostReactor.java:315)
 at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
 at java.util.concurrent.FutureTask.run(FutureTask.java:266)
 at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:180)
 at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:293)
 at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
 at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
 at java.lang.Thread.run(Thread.java:748)
````


# 相关组件版本
- nacos: 1.1.1
- dubbo: 2.7.3

