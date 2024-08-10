# DDD 脚手架

## 1. 脚手架安装使用

### 1. 生成

```shell
md5 ddd-archetype-1.0.pom > ddd-archetype-1.0.pom.md5
shasum ddd-archetype-1.0.pom > ddd-archetype-1.0.pom.sha1
```

```shell
mvn clean install
```
- 先发jar 后发maven-archetype 注意发布jar到maven仓库需要等待

### 2. 配置

```shell
/Users/whn/.m2/repository
```

- 把你的 Maven 路径的 repository 配置到 IntelliJ IDEA 创建 Maven 工程的路径下。




