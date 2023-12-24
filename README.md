
# Apache Solr

Apache Solr ile Ocak 2020 den sonraki updatedAt değerlerini gösteren Spring Boot uygulamasıdır.

 ## Proje Nasıl Klonlanır?

1. Bilgisayarınızda Git'in yüklü olması gerekmektedir.

2. Komut istemcisini açın.

3. Projeyi klonlamak istediğiniz dizine gidin, aşağıdaki komutu istemcinize yazın.


```bash 
git clone https://github.com/Berkmalhatun/Query
```
4. Kullanmış olduğunuz IDE'yi açın  
5. Klonlamış olduğunuz dosyayı IDE üzerinden açın.
6. Dosya açıldığında bağımlılıklar yüklenene kadar bekleyin.
7. CompanyApplication'a sağ tıklayıp Run diyerek çalıştırabilirsiniz.
## Docker da Solr Kurulumu

1. Docker Hub dan Solr imajı çekilir. 
  ```bash 
  docker pull solr
 ```
2. Docker da konteyner çalıştırılır.
```bash 
  docker run -d -p 8983:8983 --name enoca solr
 ```
3. Core oluşturulur.
```bash 
  docker exec -it my_solr solr create_core -c enoca
   ```
## Solr
1. Tarayıcıdan Solr açılır.         
    ```bash 
    http://localhost:8983
      ```
2. Solr'a veri eklenir.     
    Core seçme kısmından eklemiş olduğumuz core seçilir. Documents kısmına gelip Document Type JSON olarak seçilir.Ekleyeceğimiz documents için örnek kayıtlar girilir.Örneğin:   
    ```bash 
      { "id": "1", "title": "Document 1", "updatedAt": 1576368000000 }, { "id": "2", "title": "Document 2", "updatedAt": 1576368000000 }, { "id": "3", "title": "Document 3", "updatedAt": 1576368000000 }, { "id": "4", "title": "Document 4", "updatedAt": 1579046400000 }, { "id": "5", "title": "Document 5", "updatedAt": 1579046400000 }
      ```
3. Veriye ulaşmak.  
    Solr da Query kısmına gelip fq yani filtreleme kısmına updatedAt:[1577836800000 TO ] yazılır ve Raw Query Parameters kısmına ":*=" tırnak içindeki değer yazılır. Buradaki long değeri 1 Ocak 2020 den sonrakiler için getiren filtreleme değeridir. Ya da 
   ```bash 
    http://localhost:8983/solr/enocadb/select?q=*:*&fq=updatedAt:[1577836800000%20TO%20*]&rows=10 
   ```
    adresi tarayıcıya yazılabılır.

## Ekran Görüntüleri
### Bütün veri
[![image](https://i.hizliresim.com/f8sac97.PNG)](https://hizliresim.com/f8sac97)
### Dönen Veri
[![image](https://i.hizliresim.com/pix18zq.PNG)](https://hizliresim.com/pix18zq)
### Dönen Veri
[![image](https://i.hizliresim.com/7kwcm8o.PNG)](https://hizliresim.com/7kwcm8o)


## Son
İnceleyip zaman ayırdığınız için teşekkür ederim.
