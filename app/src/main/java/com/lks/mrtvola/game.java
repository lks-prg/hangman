package com.lks.mrtvola;
import static com.lks.mrtvola.R.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
public class game extends AppCompatActivity {
    TextView pokus, V_or_P, slovo, ob1, ob2, ob3, ob4, ob5;
    TextView[] obesenec={ob1, ob2, ob3, ob4, ob5};
    Button a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, r, s, t, u, v, w, x, y, z, ng;
    String[] slova = {"voda", "more", "pero", "most", "kopa", "leto", "okno", "zima", "list", "kvet", "guma", "koza", "seno", "lupa", "vlak", "ruka", "vlas", "auto", "repa", "hrad", "ropa", "ryba"};
    int pok = 5, check = 0, ob = 0;
    char zadanePismeno, p1 = '_', p2 = '_', p3 = '_', p4 = '_';
    String randslovo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        Random ra = new Random();
        int rand = ra.nextInt(slova.length);
        randslovo = slova[rand];

        ob1 = findViewById(R.id.ob1);
        ob2 = findViewById(R.id.ob2);
        ob3 = findViewById(R.id.ob3);
        ob4 = findViewById(R.id.ob4);
        ob5 = findViewById(R.id.ob5);

        ob1.setVisibility(View.INVISIBLE);
        ob2.setVisibility(View.INVISIBLE);
        ob3.setVisibility(View.INVISIBLE);
        ob4.setVisibility(View.INVISIBLE);
        ob5.setVisibility(View.INVISIBLE);
        ng = findViewById(R.id.ng);
        a = findViewById(R.id.A);
        b = findViewById(R.id.B);
        c = findViewById(R.id.C);
        d = findViewById(R.id.D);
        e = findViewById(R.id.E);
        f = findViewById(R.id.F);
        g = findViewById(R.id.G);
        h = findViewById(R.id.H);
        i = findViewById(R.id.I);
        j = findViewById(R.id.J);
        k = findViewById(R.id.K);
        l = findViewById(R.id.L);
        m = findViewById(R.id.M);
        n = findViewById(R.id.N);
        o = findViewById(R.id.O);
        p = findViewById(R.id.P);
        r = findViewById(R.id.R);
        s = findViewById(R.id.S);
        t = findViewById(R.id.T);
        u = findViewById(R.id.U);
        v = findViewById(R.id.V);
        w = findViewById(R.id.W);
        x = findViewById(R.id.X);
        y = findViewById(R.id.Y);
        z = findViewById(R.id.Z);

        pokus = findViewById(R.id.pokus);
        V_or_P = findViewById(R.id.V_or_P);
        slovo = findViewById(R.id.slovo);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'a';
                checkLetter();
                a.setEnabled(false);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'b';
                checkLetter();
                b.setEnabled(false);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'c';
                checkLetter();
                c.setEnabled(false);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'd';
                checkLetter();
                d.setEnabled(false);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'e';
                checkLetter();
                e.setEnabled(false);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'f';
                checkLetter();
                f.setEnabled(false);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'g';
                checkLetter();
                g.setEnabled(false);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'h';
                checkLetter();
                h.setEnabled(false);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'i';
                checkLetter();
                i.setEnabled(false);
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'j';
                checkLetter();
                j.setEnabled(false);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'k';
                checkLetter();
                k.setEnabled(false);
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'l';
                checkLetter();
                l.setEnabled(false);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'm';
                checkLetter();
                m.setEnabled(false);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'n';
                checkLetter();
                n.setEnabled(false);
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'o';
                checkLetter();
                o.setEnabled(false);
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'p';
                checkLetter();
                p.setEnabled(false);
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'r';
                checkLetter();
                r.setEnabled(false);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 's';
                checkLetter();
                s.setEnabled(false);
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 't';
                checkLetter();
                t.setEnabled(false);
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'u';
                checkLetter();
                u.setEnabled(false);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'v';
                checkLetter();
                v.setEnabled(false);
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'w';
                checkLetter();
                w.setEnabled(false);
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'x';
                checkLetter();
                x.setEnabled(false);
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'y';
                checkLetter();
                y.setEnabled(false);
            }
        });
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokus.setText(pok + "");
                zadanePismeno = 'z';
                checkLetter();
                z.setEnabled(false);
            }
        });
        ng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ngame();
            }
        });
    }
    private void ngame()
    {
        pok=5; pokus.setText(pok + "");
        p1 = '_'; p2 = '_'; p3 = '_'; p4 = '_';
        slovo.setText(p1 + " " + p2 + " " + p3 + " "+p4 +"");
        V_or_P.setText(" ");
        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        e.setEnabled(true);
        f.setEnabled(true);
        g.setEnabled(true);
        h.setEnabled(true);
        i.setEnabled(true);
        j.setEnabled(true);
        k.setEnabled(true);
        l.setEnabled(true);
        m.setEnabled(true);
        n.setEnabled(true);
        o.setEnabled(true);
        p.setEnabled(true);
        r.setEnabled(true);
        s.setEnabled(true);
        t.setEnabled(true);
        u.setEnabled(true);
        v.setEnabled(true);
        w.setEnabled(true);
        x.setEnabled(true);
        y.setEnabled(true);
        z.setEnabled(true);
    }
    private void startNewGame() {
        V_or_P .setText("");
        pokus.setText(check + "");
        slovo.setText(p1 + " " + p2 + " " + p3 + " "+p4 +"");
        slovo.setText(p1 + "");
    }
    public void checkLetter() {
        startNewGame();
        slovo.setText(p1 + " " + p2 + " " + p3 + " " + p4 + "");
        check = 0;
        for (int i = 0; i < randslovo.length(); i++) {
            if (zadanePismeno == randslovo.charAt(i)) {
                check = 1;
            }
        }
        if(zadanePismeno == randslovo.charAt(0))p1=zadanePismeno;
        if(zadanePismeno == randslovo.charAt(1))p2=zadanePismeno;
        if(zadanePismeno == randslovo.charAt(2))p3=zadanePismeno;
        if(zadanePismeno == randslovo.charAt(3))p4=zadanePismeno;
        slovo.setText(p1 + " " + p2 + " " + p3 + " "+p4 +"");
        pok--; //obesenec[3].setVisibility(View.VISIBLE);
        if (check == 1) {
            pok++; pokus.setText(pok + "");
            //obesenec[3].setVisibility(View.INVISIBLE); ob++;
        }
        pokus.setText(pok + "");
        if (p1 == randslovo.charAt(0) && p2 == randslovo.charAt(1) && p3 == randslovo.charAt(2)&& p4 == randslovo.charAt(3)) {
            V_or_P.setText("Výhra!"+"");
        }
        if (pok == 0) {
            V_or_P.setText("Prehra!" + "");
        }
    }
}