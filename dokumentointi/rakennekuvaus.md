RAKENNEKUVAUS

Ohjelman rakenne on varsin yksinkertainen.

Käyttöliittymä sisältää tekstikenttiä ja kaksi nappia. Toinen nappi täyttää ylemmät tekstikentät generoidun eläimen tiedoilla, ja toinen nappi täyttää alemman tekstikentän esitäytetyllä sukutaulun muotoisella HTML-taulukon koodilla, josta löytyy generoidun eläimen tiedot. Nämä tekstikentät on tarkoituksella jätetty "interactable"-muotoiseksi, jotta kentistä voisi helposti kopioida tietoja suoraan pastettavaksi muualle.

Sovelluslogiikassa on keskustana Elain-luokka, joka luo Elain-olion ja hakee sille attribuutit toisista luokista, jotka ovat ns. generaattoreita. Jokaiselle attribuutille löytyy oma generaattorinsa. Generaattorit toimivat Arrayna, josta ne valikoivat random-toolia hyväksikäyttäen Stringin tai intin jonka palauttavat Elain-luokkaan, jossa se tallennetaan olion attribuutiksi. HTMLTulostin-luokka toimii hieman eri tavalla. Se alustaa uuden Elain-olion Elain-luokasta, ja sitten täyttää HTML-taulukon hakemalla Elaimen tiedot get-metodeilla Elain-luokasta. Lopuksi se palauttaa täytetyn HTML-koodin.



