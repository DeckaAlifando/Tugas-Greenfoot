import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tanah1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tanah1 extends Actor
{
    public static final int MAX_BIJI = 1;
    int bijiCounter = 0;
    private Counter counter;
    /**
     * Act - do whatever the tanah1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        sentuhcangkul();
        tanamBiji();
        menyiram();
        progress();
    }    

    public tanah1(Counter pointCounter)
    {
        counter = pointCounter;
    }

    public void sentuhcangkul()
    {
        Actor sentuh = getOneObjectAtOffset(0, 0, cangkul.class);  
        if(sentuh != null) 
        {   
            tanah2 newTanah2;
            newTanah2 = new tanah2();
            World world;
            world = getWorld();
            world.addObject(newTanah2, 304, 205);
        }
    }   

    public void tanamBiji()
    {
        Actor tanam = getOneObjectAtOffset(0,0,bibit.class);
        if(tanam != null)
        {
            getWorld().removeObject(tanam);
            // mengembalikan ke lokasi asal biji
            bibit newBibit;
            newBibit = new bibit();
            World world;
            world = getWorld();
            world.addObject(newBibit, 27,361);

            tanah3 newTanah3;
            newTanah3 = new tanah3();
            world = getWorld();
            world.addObject(newTanah3, 285, 309);
           
            getWorld().removeObjects(getWorld().getObjects(tanah2.class)); 
            bijiCounter++;
        }
        if(bijiCounter > 1)
        {
            System.err.println("Tidak Dapat Menanam Lebih Dari 1 Biji!!! ");
            bijiCounter = MAX_BIJI;
        }
    }

    public int bijiCounter()
    {
        return bijiCounter;
    }

    public void menyiram()
    {
        Actor sentuh = getOneObjectAtOffset(0, 0, watering.class);  
        if(sentuh != null) 
        {   
            if(bijiCounter == MAX_BIJI)
            {
                counter.add(5); // tambah poin 10
                // untuk score
            }
            else
            {
                System.err.println("Tidak ada efek karena biji belum ditanam!!!");
            }
        }
    }   

    public void progress()
    {
        if(counter.getValue() >= 100)
        {
            // tambah Tunas1
            tumbuh1 newTumbuh1;
            newTumbuh1 = new tumbuh1();
            World world;
            world = getWorld();
            world.addObject(newTumbuh1, 304, 205);

            // hapus Tunas1
            if(counter.getValue() >= 200)
            {
                getWorld().removeObjects(getWorld().getObjects(tumbuh1.class));
            }
        }
        if(counter.getValue() >= 200)
        {
            // ganti background, temp & matahari
            ((world)getWorld()).setBackground("bg1.png");
            getWorld().removeObjects(getWorld().getObjects(matahari.class));
            bulan newBulan;
            newBulan = new bulan();
            getWorld().addObject(newBulan, 567,28);   

            // replace Tunas1
            tumbuh2 newTumbuh2;
            newTumbuh2 = new tumbuh2();
            World world;
            world = getWorld();
            world.addObject(newTumbuh2, 304, 205);

            System.out.println("SELAMAT TANAMAN MELATI TELAH TUMBUH SEMPURNA!!!");
            Greenfoot.stop();
        }

    }

    public void pemupukan()
    {
        Actor pemupukan = getOneObjectAtOffset(0,0,pupuk.class);
        if(pemupukan != null)
        {
            getWorld().removeObject(pemupukan);
            Greenfoot.playSound("crumble.wav");
            if(bijiCounter == MAX_BIJI)
            {
                counter.add(30);
            }
            else
            {
                System.err.println("Tidak ada efek karena biji belum ditanam!!!");
            }
            // mengembalaikan lokasi asal biji
            pupuk newPupuk;
            newPupuk = new pupuk();
            World world;
            world = getWorld();
            world.addObject(newPupuk, 553, 142);
        }
    }
}
