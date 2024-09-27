package zhj;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class TankFrame extends Frame {
    Tank myTk = new Tank(200,400,Dir.DOWN,Group.GROUP,this);
    public List<Bullet> bullets = new ArrayList<>();
    public List<Tank> tanks = new ArrayList<>();
    public List<Explode> explodes = new ArrayList<>();
    Explode e = new Explode(100,100,this);
    //public GameFactory gf = new DefaultFactory();
    public static final int GAME_WIDTH = 1000,GAME_HEIGHT = 800;
     public TankFrame() {
        setSize(GAME_WIDTH,GAME_HEIGHT);
        setResizable(false);
        setTitle("tank war");
        setVisible(true); 
        this.addKeyListener(new MyKeyListener());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
    }
    Image offScreenImage = null;
    @Override
    public void update(Graphics g){
        if(offScreenImage == null){
            offScreenImage = this.createImage(GAME_WIDTH,GAME_HEIGHT);
        }
        Graphics gOffScreen = offScreenImage.getGraphics();
        Color c = gOffScreen.getColor();
        gOffScreen.setColor(Color.black);
        gOffScreen.fillRect(0,0,GAME_WIDTH,GAME_HEIGHT);
        gOffScreen.setColor(c);
        paint(gOffScreen);
        g.drawImage(offScreenImage,0,0,null); 
    }
    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.white);
        g.drawString("子弹的数量"+bullets.size(),10,60);
        g.drawString("敌人的数量"+tanks.size(),10,80);
        g.drawString("爆炸的数量"+explodes.size(),10,100);
        g.setColor(c);
        myTk.paint(g);
        for(int i = 0;i<bullets.size();i++){
            bullets.get(i).paint(g);
        }
        for(int j = 0;j<tanks.size();j++){
            tanks.get(j).paint(g);
        }
        for(int j = 0;j<explodes.size();j++){
            explodes.get(j).paint(g);
        }
        //collision delect
        for (int i = 0; i <bullets.size() ; i++) {
            for (int j = 0; j < tanks.size(); j++)
                bullets.get(i).collideWith(tanks.get(j));
        }

       /*for(Iterator<Bullet> it = bullets.iterator();it.hasNext();){
           Bullet b = it.next();
           if (!b.isLiving()) it.remove();
           b.paint(g);
       }*/
    }
    class MyKeyListener extends KeyAdapter{
        boolean bU = false;
        boolean bD = false;
        boolean bL = false;
        boolean bR = false;
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
                default:
                    break;
            }
            setMainTankDir();
        }
        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
                case KeyEvent.VK_CONTROL:
                  myTk.fire();
                   break;
                default:
                    break;
            }
            setMainTankDir();
        }
        private void setMainTankDir(){
            if(!bL && !bU && !bR && !bD) myTk.setMoving(false);
            else{
                myTk.setMoving(true);
                if (bL) myTk.setDir(Dir.LEFT);
                if (bU) myTk.setDir(Dir.UP);
                if (bR) myTk.setDir (Dir.RIGHT);
                if (bD) myTk.setDir(Dir.DOWN);
            }
        }

    }
}
