package generics;

import java.util.ArrayList;
import java.util.List;

class Library<T> {
	        
    private List<T> medien = new ArrayList<>();

    public void addMedia(T m) {
        medien.add(m);
    }
    
}
