package com.tecsup.gestion;
import java.util.List;
public interface SpittleRepository {
List<Spittle> findSpittles(Long max,int count);
}
