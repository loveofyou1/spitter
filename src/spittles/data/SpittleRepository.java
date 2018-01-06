package spittles.data;

import spittles.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittle(long max,int count);
}
