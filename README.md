# c9_io_backup_may_3
docker added


#### Docker build
`docker build --build-arg url=https://github.com/kalai6095/c9_io_backup_may_3.git --build-arg project=c9_io_backup_may_3 --build-arg artifactid=work_repo --build-arg version=0.0.1 --no-cache -t work_repo_build .`

`docker pull mysql:5.7`

`docker run --name db -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=admin mysql:5.7`

`docker run -t --name work_repo_build_2 --link docker-mysql:mysql -p 4300:4300 work_repo_build_2`
