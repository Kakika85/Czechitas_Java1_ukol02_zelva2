# Úkol 2 – Želva Žofka 2

Každou část úkolu vytvořte jako samostatný commit. Pokud zjistíte dodatečně v kódu nějakou chybu, nevadí, commitněte
opravu jako další commit. Pokud si chcete práci průběžně zálohovat, po commitu udělejte také push, čímž se všechny
neodeslané commity nahrají na GitHub.

# Část 1.1

Vytvořte metody na kreslení základních tvarů s parametrickou délkou strany: rovnostranného trojúhelníku (trojúhelník,
který má všechny tři strany stejně dlouhé), čtverce, obdelníku a kolečka (ve skutečnosti to opět bude mnohoúhelník).

Následující sekce (*Opakování a detailní navedení k problému*) je myšlena jako opakování látky z hodiny, který vám
pomůže k řešení. Pokud víte, jak naprogramovat parametrizované metody zadané výše, můžete pokračovat k podnadpisu
*Část 1.2 - Detailní zadání*.

## Opakování a detailní navedení k problému

Chceme, aby základní tvary měly volitelné velikosti stran, tedy aby se jejich velikost dala nastavit. Připravíme metody
tak, aby přijímaly vstupní parametr(y). Pro zopakování je níže vidět ukázka metody `nakresliRovnostrannyTrojuhelnik()`,
která přijímá jako vstupní parametr `velikostStrany` typu `double`. Navenek je potřeba metodu zavolat s nějakou
hodnotou, uvnitř metody se `velikostStrany` chová jako proměnná (proto musí mít definovaný typ, např. `double`).

```java
Turtle zofka = new Turtle();

public void start() {
        // Volani metody, do ktere se preda hodnota 50.0
        nakresliRovnostrannyTrojuhelnik(50.0);

        // Volani metody, do ktere se preda hodnota 70.0
        nakresliRovnostrannyTrojuhelnik(70.0);
}

public void nakresliRovnostrannyTrojuhelnik(double velikostStrany) {
        // Zde lze používat proměnnou velikostStrany.
        // Jeji hodnota je takova, s jakou byla metoda zavolana
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
}
```

Metoda může přijímat i více parametrů za sebou (oddělujeme čárkou):

```java
Turtle zofka = new Turtle();

public void start() {

        Color cervenaBarva;
        cervenaBarva=new Color(255,0,0);

        // Volani metody, do ktere se preda hodnota 50.0 a objekt, ktery je v promenne cervenaBarva
        nakresliBarevnyRovnostrannyTrojuhelnik(50.0,cervenaBarva);

        // Volani metody, do ktere se preda hodnota 70.0 a in-line vytvoreny objekt barvy
        nakresliBarevnyRovnostrannyTrojuhelnik(70.0,new Color(0,127,255));
}

public void nakresliBarevnyRovnostrannyTrojuhelnik(double velikostStrany,Color barvaCary) {
        // Zde lze používat proměnnou velikostStrany a barvaCary:
        zofka.setPenColor(barvaCary);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
}
```

Pro mašinku můžete připravit i metodu na kreslení rovnoramenného pravoúhlého trojúhelníku. Zbývající dva úhly budou samozřejmě 45°
a délku třetí strany (přepony) vypočítáte:

```java
var velikostPrepony = Math.sqrt(2*Math.pow(velikostStrany, 2));
```

`Math.pow()` umocní první pamater na hodnotu druhého parametru. `Math.sqrt()` vypočítá druhou odmocninu.


## Část 1.2 – Detailní zadání

Vytvořte tedy parametrizované metody na kreslení rovnostranného trojuhelníku, čtverce, obdelníku a kolečka (mnohoúhelníku). Metody pro
nakreslení rovnostranného trojúhelníku a čtverce by měly přijímat jako vstupní parametr velikost strany (typu `double`).
V případě obdelníku budou nutné dva parametry (strana A, strana B). V případě kolečka se bude předávat velikost
kolečka (zda to bude poloměr, průměr nebo nějaká jiná charakteristika, nechám na vás). Pro mašinku si můžete připravit i metodu
pro kreslení pravoúhlého rovnoramenného trojúhelníku, vzoreček je uveden v předchozí části.

Pokud chcete, jako bonus můžou metody přijímat i barvu kreslení. Není to ale povinné.

# Část 2

Pomocí výše odladěných metod nakreslete následující obrázky – zmrzlinu, sněhuláka a mašinku.
Nepředpokládá se, že váš obrázek bude úplně stejný, jako vzorové obrázky – přesné tvary a rozměry se mohou lišit.
Např. pro mašinku nebo zmrzlinu můžete použít buď připravenou metodu pro rovnostranný trojúhelník (mašinka pak vepředu nebude mít pluh ale spíš šipku), nebo si vytvořte ještě metodu pro nakreslení pravoúhlého trojúhelníku).

![zmrzlina](/obrazky/ukol03-zmrzlina.svg)

![sněhulák](/obrazky/ukol03-snehulak.svg)

![mašinka](/obrazky/ukol03-lokomotiva.svg)




