#!/bin/bash
# 发布到 Maven 仓库，用于生成publish-maven相关内容
# 编译安装
mvn archetype:create-from-project -Darchetype.properties=archetype.properties
# 检查 scaffold-ddd 目录是否存在
if [ -d "publish-maven" ]; then
    # 如果存在，则递归地删除它及其所有内容
    rm -rf ./publish-maven
    echo "publish-maven 目录及其内容已被删除。"
else
    echo "publish-maven 目录不存在。"
fi
mv ./target/generated-sources/archetype publish-maven
rm -r ./target
rm -r ./publish-maven/target
rm -r ./publish-maven/pom.xml
cp ./doc/publish-maven/README.md ./publish-maven/README.md
cp ./doc/publish-maven/pom.xml ./publish-maven/pom.xml
echo "注意升级时替换pom版本 <version>1.0</version>"

