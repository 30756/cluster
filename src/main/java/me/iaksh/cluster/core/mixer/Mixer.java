package me.iaksh.cluster.core.mixer;

import java.util.ArrayList;

/***
 * 音频通道混合器
 */
public class Mixer {
    /**
     * 通过归一化混合波形
     * @param channels 多个通道的16bit PCM数据
     * @return 归一化混合的最终波形
     */
    public static short[] mix(ArrayList<ArrayList<Short>> channels) {
        if (channels.isEmpty()) {
            return new short[0];
        }

        int maxLength = 0;
        for (ArrayList<Short> data : channels) {
            maxLength = Math.max(maxLength, data.size());
        }

        // double may prevent overflow (maybe...)
        double[] mixed = new double[maxLength];
        for (ArrayList<Short> data : channels) {
            for (int i = 0; i < data.size(); i++) {
                mixed[i] += data.get(i);
            }
        }

        short[] result = new short[maxLength];
        double max = (double) Short.MAX_VALUE;
        for (int i = 0; i < maxLength; i++) {
            // normalize
            result[i] = (short)(mixed[i] * max / Math.max(max, Math.abs(mixed[i])));
        }

        return result;
    }
}
