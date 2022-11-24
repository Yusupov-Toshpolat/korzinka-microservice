# Korzinka microservices <sup style="color:red">beta</sup>
### Ishga tushirish uchun zarur talablar:

1. Dastur ishga tushirishdan oldin siz dastur uchun talab qilinadigon `application.properties` filelarni qayerdan o'qib olib kelinishi kerekligini `cloud-config-server` modulega ko'rsatishingiz kerak (Ma'lumotlar bazasi sifatida PostgreSQL ishlatilgan).
2. Cache xotira uchun Redis ishlatilingan, bu uchun siz o'z qurilmagingizga redis o'rnatishingiz kerak https://redis.io/download/#redis-downloads va `cloud-config-server` moduleidagi `application.properties` ga o'z konfiguratsiyagizni to'g'irlab qo'yishingiz kerak.
3. `cloud-config-server` 8888 : port da ishga tushadi va run qilishdan oldin bu port bo'sh ekanligini tekshiring.
4. Dastur run qilish ketmaketligi :
   1-chi `cloud-config-server` ishgatushadi chunku u dastur uchun `application.properties` filelarni yuklab keladi.
   2-chi `discovery-server-eureka` ishga tushadi bu server "load balancing" qilish uchun qolgan modulelar shu server uchun client bo'ladi
   3-chi `gateway-server` ishga tushadi bu server dasturdagi service lar uchun to'g'ridan-to'g'ri murojatni cheklaydi



#### Service ports
###### user-service: 8001
###### product-service: 8002
###### orders-service: 8003
###### delivery-service: 8004
###### cashback-service: 8005
###### gmail-service : 8006


# Dastur haqida
Dastur hozirda to'liq tuganlanmagan.

# Aloqa
##### linkedIn => https://www.linkedin.com/in/toshpolat-yusupov-a7311924b/
##### Telegram => https://t.me/Yusupov_245
