# <div align="center"> Progetto-Chalet </div>

> "Progetto-Chalet" è un programma che si occupa della gestione di uno stabilimento balneare dal punto di vista del Cliente e del Proprietario.
> Effettuando l'accesso come Cliente con il proprio account si ha la possibilità di prenotare: eventi, posti ombrelloni, tavoli e carta dei vini per il ristorante.
> Inoltre si può consultare semplicemente le condizioni metereologiche o la situazione della spiaggia.
> L'account "Proprietario", oltre a poter utilizzare le stesse operazioni del "Cliente", ha accesso a funzioni specifiche per la gestione del proprio chalet.
> Per comodità abbiamo utilizzato il software [Postman](https://www.postman.com/) per effettuare le varie operazioni sopra citate tramite la porta "localhost:8080". 
> Di seguito sono elencate le rotte che devono essere inserite dopo la porta appena menzionata, per eseguire le relative chiamate.
> (Il codice del progetto è interamente in java e si trova dentro "chalet/src".)
***
## <div align="center"> Path da utilizzare per il profilo Cliente e Proprietario </div>

##### <div align="center"> Le prenotazioni per l'attrezzatura, gli eventi e gli ombrelloni sono consentite solo con buone condizioni meteo! </div>

TIPO |ROTTA|INPUT|DESCRIZIONE
------ | ---|----|----------
POST|/creaAccount|"user" <br> "pass"|Crea un account personale inserendo username e password
POST|/login|"user" <br> "pass"|Accedi al tuo account inserendo username e password
GET|/logout| |Disconnette il proprio account
GET|/previsioni| |Visualizza le condizioni metereologiche
POST|/prenota|"richiesta" <br> "nome"|Ti permette di prenotare eventi, tavoli o attrezzature per la balneazione inserendo la richiesta e il nome a cui intestare la prenotazione
POST|/prenotaOmbrellone|"posto" <br> "nome"|Per prenotare un posto ombrellone inserendo il posto e il nome a cui intestare la prenotazione
GET|/vini| |Restituisce la lista dei vini
GET|/visualizzaEventi| |Visualizza l'elenco dei prossimi eventi
GET|/visualizzaSpiaggia| |Visualizza graficamente la disposizione degli ombrelloni in una spiaggia


### <div align="center"> Esempio di una prenotazione del posto ombrellone </div>
<div align="center"><img src="https://raw.githubusercontent.com/Luca-Marcianesi/Progetto-chalet/master/img/Esempio%20Postman%20Cliente.png" ></div>

***
## <div align="center"> Path da utilizzare per il profilo Proprietario </div>

TIPO |ROTTA|INPUT|DESCRIZIONE
------ | --|------|----------
GET|/listaAccount| |Visualizza a schermo tutti gli account presenti nel server
POST|/creaEvento|"nome" "posti" "anno" <br> "mese" "giorno" "prezzo"|Creare gli eventi inserendo la descrizione e l'orario
POST|/creaSpiaggia|"righe" "colonne"|Creazione di una spiaggia inserendo le righe e le colonne degli ombrelloni
GET|/chalet| |Visualizza a schermo tutte le informazioni utili dello chalet
POST|/cambiaVino|"codice" "prezzo"|Permette di modificare i prezzi dei vini

### <div align="center"> Esempio di login del prorpietario con le credenziali di default </div>
<div align="center"><img src="https://raw.githubusercontent.com/Luca-Marcianesi/Progetto-chalet/master/img/Esempio%20Postman%20Proprietario.png"" ></div>

***
- ## Use Case Diagram
  > Casi d'uso utilizzati per la modellazione del progetto, suddivisi in due attori principali
  - ### Cliente
    > Casi d'uso del profilo Cliente ma accessibili anche a Proprietario
    
  <div align="center"><img src="https://raw.githubusercontent.com/Luca-Marcianesi/Progetto-chalet/master/img/Cliente.jpg" width="500" height="500" ></div>
     
  - ### Proprietario
    > Casi d'uso esclusivi del profilo Proprietario
    
  <div align="center"><img src="https://raw.githubusercontent.com/Luca-Marcianesi/Progetto-chalet/master/img/Proprietario.jpg" width="500" height="500" ></div>

     
- ## Use Class Diagram
  > Uso delle classi utilizzato per l'impostazione del progetto 
  
    <div align="center"><img src="https://raw.githubusercontent.com/Luca-Marcianesi/Progetto-chalet/master/img/Uso%20delle%20classi%20Class%20Diagram.jpg" width="600" height="400" ></div>
  
    Package|Classi
    -------|------
    Model|UsaApi;
    Liste|Lista; <br>ListaOggettiPrenotabili;  ListaOggettiConValore;
    Informazioni|Informazioni;
    Interfacce|OggettoConValore;  OgettoPrenotabile
    Spiaggia|Attrezzatura;  <br>Ombrellone;  ListaOmbrelloni;
    Ristorante|Tavolo;  Piatto; <br>Menù;  Sala;
    OtherClass|Eventi;  Previsioni;  Prezzo; <br>Chalet;  PrenotazionePosto;  Prenotazione;
    Server|Server;  Account;
    Controller|Controller;
  
- ## Sequence Diagram
  > Diagramma delle sequenze utile a definire il funzionamento delle chiamate web utilizzate tramite Postman
  - ### Cliente
  <div align="center"><img src="https://raw.githubusercontent.com/Luca-Marcianesi/Progetto-chalet/master/img/Diagramma%20delle%20sequenze%20Cliente.jpg" width="600" height="400" ></div>
  

  - ### Proprietario
  <div align="center"><img src="https://raw.githubusercontent.com/Luca-Marcianesi/Progetto-chalet/master/img/diagramma%20delle%20sequenze%20Proprietario.jpg" width="600" height="400" ></div>

***
## Eccezioni
* #### Eccezione posto

    Se viene immesso un posto minore di 1
  
* #### Eccezione prezzo

   Se viene immesso un prezzo negativo
  
* #### Eccezione spiaggia

   Se viene richiesta la prenotazione di un ombrellone in assenza di una spiaggia
  
***
## TEST
+ Sui Login
  + Accesso effettuato
  + Credenziali sbagliate
+ Sulle previsioni
  + Previsioni attuali
  + Previsioni non disponibili
***
## <div align="center">API utilizzati<div align="center">

Nome|Url|Descrizione
----|--|----
openweathermap|http://api.openweathermap.org/data/2.5/forecast?id=6540261&appid=fab715b1276e37b8c17a87274e509451|Utilizzato per l'acquisizione del meteo in tempo reale
spoonacular|https://api.spoonacular.com/food/wine/recommendation?wine=merlot&number=10&apiKey=62f8d2a4877f45d29f4f00d66818c72e|Utilizzato per l'acquisizione dei vini

***
## Tool e Librerie da istallare:
* [JSON simple](https://code.google.com/archive/p/json-simple/)
* [Spring Inizializr](https://start.spring.io/)
* [Spring Tool 4](https://marketplace.eclipse.org/content/spring-tools-4-aka-spring-tool-suite-4?mpc=true&mpc_state=)
* [Maven Integration for Eclipse](https://marketplace.eclipse.org/content/maven-integration-eclipse-luna-and-newer?mpc=true&mpc_state=)

***
## Note:
La classe Prenotazione chiede in ingresso un intero che per gli oggetti che sono prenotabili da una sola persona è fissato a uno mentre, per gli eventi, il valore dipende dalla dimensione del vettore prenotazioni proprio dell'oggetto "Evento" stesso.
***
## Contatti:
Programmatore | E-mail | Contributo
--------------|--------|-----------
Luca Marcianesi|s1093754@studenti.univpm.it| <div align="center"> 43% </div>
Diego Mignani|s1093616@studenti.univpm.it| <div align="center"> 32% </div>
Edoardo Tarulli|s1094923@studenti.univpmit| <div align="center"> 25% </div>

***

Di seguito elencati i voti ottenuti per la presentazione all'esame del 25/01/2021:
Programmatore | Voto
--------------|--------
Luca Marcianesi|29/30
Diego Mignani|29/30
Edoardo Tarulli|30/30

Grazie all'alta valutazione il progetto è stato preso in considerazione, dai professori del corso di "Programmazione a Oggetti", come esempio per i futuri esami nella facoltà di Ingegneria Informatica ed Automazione dell'Università Politecnica delle Marche.
