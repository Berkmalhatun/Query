# Apache Solr
## Özet
Apache Solr ile Ocak 2020 den sonraki updatedAt değerlerini gösteren Spring Boot uygulamasıdır.
## Docker da Solr kurulumu
#### 1- Dockerhubdan Solr imajı çekilir.
docker pull solr
#### 2- Konteyner çalıştırılır
docker run -d -p 8983:8983 --name enoca solr
#### 3- Core oluşturulur
docker exec -it my_solr solr create_core -c enoca
## Solr 
#### 1- Tarayıcıdan solr açılır
http://localhost:8983
#### 2- Solr'a veri eklemek 
Core seçme kısmından eklemiş olduğumuz core seçilir. Documents kısmına gelip Document Type JSON olarak seçilir.Ekleyeceğimiz documents için örnek kayıtlar girilir.
    {
        "id": "1",
        "title": "Document 1",
        "updatedAt": 1576368000000
    },
    {
        "id": "2",
        "title": "Document 2",
        "updatedAt": 1576368000000
    },
    {
        "id": "3",
        "title": "Document 3",
        "updatedAt": 1576368000000
    },
    {
        "id": "4",
        "title": "Document 4",
        "updatedAt": 1579046400000
    },
    {
        "id": "5",
        "title": "Document 5",
        "updatedAt": 1579046400000
    }
#### 3- Veriye ulaşmak 
 Solr da Query kısmına gelip fq yani filtreleme kısmına updatedAt:[1577836800000 TO *] yazılır. Buradaki long değeri 1 Ocak 2020 den sonrakiler için getiren filtreleme değeridir. Ya da
http://localhost:8983/solr/enocadb/select?q=*:*&fq=updatedAt:[1577836800000%20TO%20*]&rows=10 
adresi tarayıcıya yazılabılır.

