# xshop-openapi-java
xshop open api java sdk client


命令：
1、通过 scheme 文件生成 java代码
mvn generate-sources

2、发布到中央仓库
mvn clean install deploy -P release -Dgpg.passphrase=12345678

