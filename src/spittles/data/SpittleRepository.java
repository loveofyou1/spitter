package spittles.data;

import spittles.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittle(Long max,int count);

    Spittle findOne(long spittleId);
}
