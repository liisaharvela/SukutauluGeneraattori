# SukutauluGeneraattori

Olen huomannut astetta mielenkiintoisemman ilmiön GitHub vs Netbeansin käytössä. GitHub näemmä kohtelee suuria ja pieniä alkukirjaimia samana, mutta Netbeans ei. Toisinsanoen, luokka Varigeneraattori.java oli ensin nimetty VariGeneraattori.javaksi, ja refraktoroin sen omalla koneellani jotta keskimmäinen G ei olisi enää isolla. Nyt kuitenkin ladatessani tiedostot GitHubiin, GitHub tunnistaa kyllä että Varigeneraattorin nimi on muuttunut luokassa sisällä, mutta ei muuta itse luokan nimeä. Näinollen, kun repo ladataan toiselle koneelle, saattaa Varigeneraattori-luokka olla hajalla. Refraktoroimalla luokan nimelle VariGeneraattori koko koodin pitäisi alkaa toimimaan myös muilla koneilla. 

Samaa ongelmaa on esiintynyt myös packagejeni nimissä, sillä nekin olivat aluksi muotoa SukutauluGeneraattori ja sittemmin ohjaajien ehdotuksesta yritin vaihtaa niitä muotoon sukutaulugeneraattori. Tämä aiheutti hämminkiä mm. javadocsissa, jonka olen saanut nyt kuitenkin toimimaan sekä omalla pöytäkoneellani että ohjaaja Pallero_n koneella. Se ei kuitenkaan toimi omalla läppärilläni, ja epäilen syyksi juuri näitä kirjainkoko-ongelmia.

Tämä ongelma on myös aiheuttanut mm. pit-raporttien generoimisessa ongelmia, mutta ne sain mielestäni jo varhaisessa vaiheessa hyvin ratkottua.

Yritän korjata Varigeneraattori-luokan ongelman parhaani mukaan vielä ennen deadlinea, mutta tämä ei ole nyt minusta johtuva ilmiö, ja jos tämä tulee esille koodiani arvostellessa toivoisin, että tämän READMEn selitys otettaisiin huomioon. Kiitos!

27.02.2015 klo 15.19 - Ongelma näyttää korjaantuneen. Testattu välillä oma pöytätietokoneeni - poikaystäväni pöytäkone - oma läppärini, joista pöytäkoneeni on se, millä projekti on alunperin luotu ja millä se on aina toiminut. Varigeneraattori-luokka toimii toivotusti nyt kahdella "ulkopuolisella" koneella. Toivon, että ongelma on tosiaan tällä selvä! Jätän varmuuden vuoksi tämän selityksen vielä tähän.