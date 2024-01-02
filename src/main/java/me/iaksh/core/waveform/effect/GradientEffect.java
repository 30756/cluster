package me.iaksh.core.waveform.effect;

import me.iaksh.core.waveform.WaveGenerator;

public abstract class GradientEffect extends Effect {

    public GradientEffect(WaveGenerator generator) {
        super(generator);
    }

    protected abstract float gradientCoefficient(int waveformLen,int i);

    @Override
    public final short[] genWaveform(int ms, int freq) {
        short[] waveform = generator.genWaveform(ms,freq);
        for(int i = 0;i < waveform.length;i++) {
            waveform[i] = (short) (waveform[i] * gradientCoefficient(waveform.length,i));
        }
        return waveform;
    }
}
