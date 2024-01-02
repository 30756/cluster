package me.iaksh.cluster.tests;

import me.iaksh.cluster.core.notation.EqualTempNote;
import me.iaksh.cluster.core.notation.Section;
import me.iaksh.cluster.core.mixer.NESLikeSynthesizer;
import me.iaksh.cluster.core.notation.FreqNote;
import me.iaksh.cluster.core.player.Player;
import me.iaksh.cluster.core.waveform.effect.Effect;
import me.iaksh.cluster.core.waveform.effect.ExpGradientEffect;

import java.util.ArrayList;

public class CoreTestcase {

    private Effect effect;

    private void initEffect() {
        ExpGradientEffect effect = new ExpGradientEffect();
        effect.setExpCoefficient(4.0f);
        this.effect = effect;
    }

    private ArrayList<Section> genTestSectionSq0() {
        ArrayList<Section> sections = new ArrayList<>();

        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,false,0,0,0,effect));
            section.getNotes().add(new EqualTempNote(0.25f,false,0,0,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,0,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,1,0,effect));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,true,6,1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,5,1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,6,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,2,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,1,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,true,3,1,0,effect));
            section.getNotes().add(new EqualTempNote(0.25f,false,3,1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,0,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,1,0,effect));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,true,6,1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,5,1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,6,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,1,2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,7,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,6,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,1,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,false,6,1,0,effect));
            section.getNotes().add(new EqualTempNote(0.25f,false,6,1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,0,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,5,1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,6,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,1,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,false,2,1,0));
            section.getNotes().add(new EqualTempNote(0.25f,false,2,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,0,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,5,1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,6,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,2,1,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,false,1,1,0));
            section.getNotes().add(new EqualTempNote(0.25f,false,1,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,0,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,6,0,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,6,0,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,7,0,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,true,1,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,1,0,0));
            section.getNotes().add(new EqualTempNote(0.25f,true,7,0,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,6,0,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(1.0f,false,6,0,0));
            sections.add(section);
        }

        return sections;
    }

    private ArrayList<Section> genTestSectionSq1() {
        ArrayList<Section> sections = new ArrayList<>();

        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,false,0,1,0,effect));
            section.getNotes().add(new EqualTempNote(0.25f,false,0,1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,2,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,2,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,2,0,effect));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,true,6,2,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,5,2,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,6,2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,2,2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,2,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,true,3,2,0,effect));
            section.getNotes().add(new EqualTempNote(0.25f,false,3,2,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,2,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,2,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,2,0,effect));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,true,6,2,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,5,2,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,6,2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,1,3,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,7,2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,6,2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,2,0));
            sections.add(section);
        }
        {
            Section section = new Section(4, 4);
            section.getNotes().add(new EqualTempNote(0.25f, false,6, 2, 0,effect));
            section.getNotes().add(new EqualTempNote(0.25f, false,6, 2, 0,effect));
            section.getNotes().add(new EqualTempNote(0.125f, false,0, 1, 0));
            section.getNotes().add(new EqualTempNote(0.0625f, false,5, 2, 0));
            section.getNotes().add(new EqualTempNote(0.0625f, false,6, 2, 0));
            section.getNotes().add(new EqualTempNote(0.125f, false,5, 2, 0));
            section.getNotes().add(new EqualTempNote(0.125f, false,3, 2, 0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,false,2,2,0));
            section.getNotes().add(new EqualTempNote(0.25f,false,2,2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,5,2,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,6,2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,2,2,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,false,1,2,0));
            section.getNotes().add(new EqualTempNote(0.25f,false,1,2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,6,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,6,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,7,1,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,true,1,2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,2,2,0));
            section.getNotes().add(new EqualTempNote(0.25f,true,7,1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,6,1,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(1.0f,false,6,1,0));
            sections.add(section);
        }

        return sections;
    }

    private ArrayList<Section> genTestSectionTri() {
        ArrayList<Section> sections = new ArrayList<>();

        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,false,0,0,0,effect));
            section.getNotes().add(new EqualTempNote(0.25f,false,0,0,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,0,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,-1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,-1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,-1,0,effect));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,true,6,-1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,5,-1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,6,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,2,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,-1,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,true,3,-1,0,effect));
            section.getNotes().add(new EqualTempNote(0.25f,false,3,-1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,0,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,-1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,-1,0,effect));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,-1,0,effect));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,true,6,-1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,5,-1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,6,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,1,-2,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,7,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,6,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,-1,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,false,6,-1,0));
            section.getNotes().add(new EqualTempNote(0.25f,false,6,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,0,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,5,-1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,6,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,3,-1,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,false,2,-1,0));
            section.getNotes().add(new EqualTempNote(0.25f,false,2,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,-1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,5,-1,0));
            section.getNotes().add(new EqualTempNote(0.0625f,false,6,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,5,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,2,-1,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,false,1,-1,0));
            section.getNotes().add(new EqualTempNote(0.25f,false,1,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,0,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,6,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,6,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,7,-1,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(0.25f,true,1,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,2,-1,0));
            section.getNotes().add(new EqualTempNote(0.25f,true,7,-1,0));
            section.getNotes().add(new EqualTempNote(0.125f,false,6,-1,0));
            sections.add(section);
        }
        {
            Section section = new Section(4,4);
            section.getNotes().add(new EqualTempNote(1.0f,false,6,-1,0));
            sections.add(section);
        }

        return sections;
    }

    private ArrayList<Section> genTestSectionNoi() {
        ArrayList<Section> sections = new ArrayList<>();

        for(int i = 0;i < 9;i++) {
            Section section = new Section(4,4);
            section.getNotes().add(new FreqNote(0.21875f,false,0,effect));
            section.getNotes().add(new FreqNote(0.03125f,false,1000,effect));
            section.getNotes().add(new FreqNote(0.21875f,false,0,effect));
            section.getNotes().add(new FreqNote(0.03125f,false,100,effect));
            section.getNotes().add(new FreqNote(0.21875f,false,0,effect));
            section.getNotes().add(new FreqNote(0.03125f,false,10,effect));
            section.getNotes().add(new FreqNote(0.21875f,false,0,effect));
            section.getNotes().add(new FreqNote(0.03125f,false,1,effect));
            sections.add(section);
        }

        return sections;
    }

    private ArrayList<ArrayList<Section>> genTestSection() {
        initEffect();
        ArrayList<ArrayList<Section>> sections = new ArrayList<>();
        sections.add(genTestSectionSq0());
        sections.add(genTestSectionSq1());
        sections.add(genTestSectionTri());
        sections.add(genTestSectionNoi());
        return sections;
    }

    public void exec() {
        int bpm = 120;
        //new NESLikeSynthesizer(bpm).saveToWav("./out.wav",genTestSection());
        new Player(0.1f).play(0.25f,new NESLikeSynthesizer(bpm).genWavform(genTestSection()));
    }
}