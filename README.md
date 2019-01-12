# JavaTemp
# Java REST API getting temperatures from ESP

Application using MariaDB for storing temperatures data with ID of device every 5 minutes.

GET http://192.168.8.25:8080/rest/temp/{id}

GET http://192.168.8.25:8080/rest/temp/getall

POST http://locallhost:8080/rest/temp

#---Script for sending POST message--

cat /sys/class/thermal/thermal_zone0/temp >/home/sylwlo/tempCheck/actualTemp.log

actualTemp="$(cat /home/sylwlo/tempCheck/actualTemp.log)"

curl -d '{"temp":'$actualTemp', "deviceId":"0"}' -H "Content-Type: application/json" -X POST http://192.168.8.25:8080/rest/temp
 
security develop

user login: devuser pass:dev1234 http://192.168.8.25:8080/user

admin login: admin pass: admin1234 http://192.168.8.25:8080/admin
