package animalkingdom;

public class Main
{
    public static void main(String[] args)
    {
        Mammal panda = new Mammal(Panda, 1869);
        Mammal zebra = new Mammal(Zebra, 1778);
        Mammal koala = new Mammal(Koala, 1816);
        Mammal sloth = new Mammal(Sloth, 1804);
        Mammal armadillo = new Mammal(Armadillo, 1758);
        Mammal raccoon = new Mammal(Raccoon, 1758);
        Mammal bigfoot = new Mammal(Bigfoot, 2021);

        Bird pigeon = new Bird(Pigeon, 1837);
        Bird peacock = new Bird(Peacock, 1821);
        Bird toucan = new Bird(Toucan, 1758);
        Bird parrot = new Bird(Parrot, 1824);
        Bird swan = new Bird(Swan, 1958);

        Fish salmon = new Fish(Salmon, 1758);
        Fish catfish = new Fish(Catfish, 1817);
        Fish perch = new Fish(Perch, 1758);

        ArrayList<Mammal> mammalArrayList = new ArrayList<Mammal>();
        mammalArrayList.add(panda);
        mammalArrayList.add(zebra);
        mammalArrayList.add(koala);
        mammalArrayList.add(sloth);
        mammalArrayList.add(armadillo);
        mammalArrayList.add(raccoon);
        mammalArrayList.add(bigfoot);

        ArrayList<Bird> birdArrayList = new ArrayList<Bird>();
        birdArrayList.add(pigeon);
        birdArrayList.add(peacock);
        birdArrayList.add(toucan);
        birdArrayList.add(parrot);
        birdArrayList.add(swan);

        ArrayList<Fish> fishArrayList = new ArrayList<Fish>();
        fishArrayList.add(salmon);
        fishArrayList.add(catfish);
        fishArrayList.add(perch);
    }
}
