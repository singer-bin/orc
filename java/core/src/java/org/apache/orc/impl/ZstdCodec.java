package org.apache.orc.impl;

import com.github.luben.zstd.Zstd;
import com.github.luben.zstd.ZstdCompressCtx;
import org.apache.orc.CompressionCodec;
import org.apache.orc.CompressionKind;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.EnumSet;

public class ZstdCodec  implements CompressionCodec, DirectDecompressionCodec {
    private ZstdOptions zstdOptions = null;
    private ZstdCompressCtx zstdCompressCtx = null;

    public ZstdCodec(int level, int windowLog) {
        this.zstdOptions = new ZstdOptions(level, windowLog);
    }

    public ZstdCodec() {
        this(3, 0);
    }

    public ZstdOptions getZstdOptions() {
        return zstdOptions;
    }
    @Override
    public boolean compress(ByteBuffer in, ByteBuffer out, ByteBuffer overflow) throws IOException {
        return false;
    }

    @Override
    public void decompress(ByteBuffer in, ByteBuffer out) throws IOException {

    }

    @Override
    public CompressionCodec modify(EnumSet<Modifier> modifiers) {
        return null;
    }

    @Override
    public void reset() {

    }

    @Override
    public void close() {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void directDecompress(ByteBuffer in, ByteBuffer out) throws IOException {

    }
}
