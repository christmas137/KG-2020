package Utils;

import javax.swing.*;
import java.awt.*;

public class Picture extends JPanel {
    @Override

    public void paint(Graphics g) {
        field(g);
        train(g);
        background(g);
    }
    private void background (Graphics g){
        sign(g);
        bird(g);
        cloud(g);
    }
    private void sign (Graphics gr2d){
        gr2d.setColor(Color.lightGray);
        gr2d.fillRect(105, 480, 10, 150);
        gr2d.setColor(Color.white);
        gr2d.drawRoundRect(30, 430, 170, 50, 15, 15);
        gr2d.setColor(Color.blue);
        gr2d.fillRoundRect(31, 431, 168, 48, 15, 15);


        gr2d.setColor(Color.white);
        Font font = new Font("Verdana", Font.BOLD, 22);
        gr2d.setFont(font);
        gr2d.drawString("Усмань", 70, 460);

    }
    private void cloud (Graphics gr2d){
        gr2d.setColor(Color.white);
        gr2d.fillOval(900, 160, 60, 60);
        gr2d.fillOval(925, 140, 80, 85);
        gr2d.fillOval(960, 130, 75, 95);
        gr2d.fillOval(995, 145, 60, 70);

        gr2d.setColor(Color.black);
        gr2d.drawArc(945, 170, 20, 30, 45, 100);
        gr2d.drawArc(975, 165, 20, 30, 45, 100);
        gr2d.drawArc(960, 170, 20, 30, 0, -170);

    }
    private void bird (Graphics g){
        g.setColor(Color.black);
        g.drawArc(60, 100, 40, 40, 90, 90);
        g.drawArc(20, 100, 40, 40, 0, 90);

    }
    private void train (Graphics g){
        locomotive(g);
        for( int i = 0; i < 3; i++) {
            wagon(g, 395*i, 0);
        }

    }
    private void field (Graphics g ){
        Graphics2D field = (Graphics2D) g;
        field.setColor(Color.green);
        field.fillRect(-40, 600, 2000, 1000);
        field.setColor(Color.cyan);
        field.fillRect(-40, 0, 2000, 600);
        field.setColor(Color.lightGray);
        field.fillRect(-40, 690,2000,25);

        for(int i = 0; i < 100; i++ ){
            Color brown = new Color (170, 102, 0) ;
            g.setColor ( brown ) ;
            g.fillRect(i*80, 715, 40, 25);

        }

    }
    private void locomotive (Graphics g){
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setColor(Color.RED);
        gr2d.fillRect(300, 470,300, 150 );
        gr2d.setColor(Color.blue);
        gr2d.fillRect(360,370, 50, 100);
        gr2d.fillRect(550, 350,165, 270);
        gr2d.setColor(Color.ORANGE);
        gr2d.fillRect(350,370, 70,40);
        gr2d.setColor(Color.YELLOW);
        gr2d.fillRect(590, 370,90 , 90);
        gr2d.setColor(Color.darkGray);
        gr2d.fillOval(545,525,170, 170);
        gr2d.fillOval(425,590, 100, 100 );
        gr2d.fillOval(310,590, 100, 100 );
        gr2d.setColor(Color.YELLOW);
        gr2d.fillOval(570, 557, 115, 115);
        gr2d.fillOval(440, 605, 70, 70);
        gr2d.fillOval(325, 605, 70, 70);


        gr2d.setPaint(Color.black);
        Polygon j = new Polygon();
        j.addPoint(360,630);
        j.addPoint(650,600);
        j.addPoint(652, 620);
        j.addPoint(360, 650);
        g.fillPolygon(j);

        gr2d.setPaint(Color.ORANGE);
        Polygon t = new Polygon();
        t.addPoint(300, 470);
        t.addPoint(300, 650);
        t.addPoint(200,650);
        g.fillPolygon(t);

        Polygon f = new Polygon();
        f.addPoint(550, 350);
        f.addPoint(632,280 );
        f.addPoint(715, 350);
        g.fillPolygon(f);

        g.setColor(Color.white);
        Font font = new Font("Verdana", Font.BOLD, 22);
        g.setFont(font);
        g.drawString("РЖД", 430, 500);
    }

    private void wagon(Graphics g, int x, int y ){

        Graphics2D vg = (Graphics2D) g;
        vg.setColor(Color.red);
        vg.fillRect(x+715,y+530, 45, 37);
        vg.setColor(Color.ORANGE);
        vg.fillRect(x+760, y+370, 350, 250);
        vg.setColor(Color.darkGray);
        vg.fillOval(x+770,y+590, 100, 100 );
        vg.fillOval(x+1000,y+590, 100, 100 );
        vg.setColor(Color.YELLOW);
        vg.fillOval(x+785, y+605, 70, 70);
        vg.fillOval(x+1015,y+605, 70, 70 );
        vg.setColor(Color.cyan);
        vg.fillRect(x+780, y+400, 80, 100);
        vg.fillRect(x+895, y+400, 80, 100);
        vg.fillRect(x+1010, y+400, 80, 100);

        vg.setColor(Color.BLUE);
        Polygon d = new Polygon();
        d.addPoint(x+740, y+370);
        d.addPoint(x+810,y+320 );
        d.addPoint(x+1060, y+320);
        d.addPoint(x+1130,y+370);
        g.fillPolygon(d);

    }
    }
