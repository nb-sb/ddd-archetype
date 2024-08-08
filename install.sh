#!/bin/bash
# 编译安装
mvn archetype:create-from-project -Darchetype.properties=archetype.properties
# 检查 scaffold-ddd 目录是否存在
if [ -d "scaffold-ddd" ]; then
    # 如果存在，则递归地删除它及其所有内容
    rm -rf ./scaffold-ddd
    echo "scaffold-ddd 目录及其内容已被删除。"
else
    echo "scaffold-ddd 目录不存在。"
fi
mv ./target/generated-sources/archetype scaffold-ddd
rm -r ./target
rm -r ./scaffold-ddd/target

content="# archetype - DDD 脚手架

## 1. 脚手架安装使用

### 1. 生成

\`\`\`shell
mvn clean install
\`\`\`

- 在 IntelliJ IDEA 执行 \`mvn clean install\` 这样会把脚手架安装到本地仓库中

### 2. 配置

\`\`\`shell
/Users/whn/.m2/repository
\`\`\`

- 把你的 Maven 路径的 repository 配置到 IntelliJ IDEA 创建 Maven 工程的路径下。"

echo -e "$content" >> scaffold-ddd/README.md

