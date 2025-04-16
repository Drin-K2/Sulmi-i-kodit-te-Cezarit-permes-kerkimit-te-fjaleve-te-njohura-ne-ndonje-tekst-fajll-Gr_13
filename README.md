# Sulmi i Kodit te Cezarit permes Kerkimit te Fjaleve te Njohura ne ndonje Tekst File - Grupi 13

Ky projekt simulon nje sulm ndaj Kodit te Cezarit duke perdorur nje liste fjalesh te njohura te ruajtura ne nje fjall tekstual. Programi perpiqet te gjeje çelsin e enkriptimit duke testuar te gjitha zhvendosjet (1-25) dhe duke kontrolluar nese ndonje variant i dekriptuar permban fjale te njohura.

## Perdorimi
1. Zgjidhni njerin nga opsinet:
   -Shkruani tekstin e enkriptuar manualisht
   -Ngarkoni nje skedar me tekstin e enkriptuar
2. Programi do te provoje te gjitha çelsat e mundshem dhe do te ndaloje kur te gjeje fjale te njohura.
3. Teksti i dekriptuar dhe celsi i mundshem do te shfaqen ne ekran.

## Kerkesat
-Java 8 ose me i ri
-Fjalori 'TextFile.txt' i vendosur ne folderin 'src/', qe permban fjale te njohura (nje fjale per rresht)

## Si funksionon
- Programi perdor nje qasje te thjeshte brute force per te gjetur celesin e sakte qe eshte perdorur per te enkriptuar nje tekst me Caesar Cipher. Ja hapat qe ndjek:
   1. Merr tekstin e enkriptuar nga perdoruesi(ose nga skedari).
   2. Per cdo vlere te mundshme te celesit nga 1 deri 25:
       - Zberthen tekstin duke e zhvendosur cdo shkronje pas ne alfabet.
       - Kontrollon nese teksti i zberthyer permban fjale qe ekzistojne ne fjalor (TextFile.txt).
   3. Nese gjendet nje perputhje e afishon celesin dhe tekstin e zberthyer.
   4. Nderpret kerkimin sapo te gjendet nje zberthim i besueshem.
  Kjo qasje eshte efektive per Ceasar Cipher sepse ka vetem 25 celesa te mundshem - keshtu testimi i te gjitheve eshte shume i shpejte.

## Funksionet kryesore
- decrypt(String text, int shift)`  
  Kthen një version të dekriptuar të tekstit për një çelës të dhënë.

- loadDictionary(String filePath)`  
  Lexon fjalorin nga një skedar tekstual dhe e ruan në listë.

- containsKnownWords(String text, List<String> dictionary)`  
  Kontrollon nëse teksti i zbërthyer përmban ndonjë fjalë nga fjalori

## Grupi 
Projekti i realizuar nga ***Grupi 13***
Lenda: Siguria e te dhenave
Viti akademik: 2024/2025

## Licenca

Ky projekt eshte ne dispozicion per perdorim dhe ndryshim ne perputhje me licencen [MIT License](https://opensource.org/licenses/MIT)


