package Refacoring;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GeometryCollection<T extends Geometry> {
	private List<T> geometryList; //deleted final and changed name to geometryList

	public GeometryCollection() {
		geometryList = new ArrayList<T>();
	}

	public void add(T t) {
		geometryList.add(t);
	}

	public void remove(T t) {
		geometryList.remove(t);
	}

	public boolean contains(T t) {
		return geometryList.contains(t);
	}

	/* dont need 2 contains
	public boolean containsGeometry(Geometry geom) {
		return geometryList.contains(geom);
	}
	*/

	/*
	public T getById(final int id) throws InvalidAccessException {
		T element = null;
		for (T t : geometryList) {
			if (t.getId() == id) {
				element = t;
				break;
			}
		}

		if (element == null) {
			throw new InvalidAccessException("No such element.");
		}

		return element;
	}
	*/
	
	/*
	 * search for the Geometry with the id
	 */
	public T getById(UUID id) throws InvalidAccessException {
	    for (T element : geometryList) {
	        if (element.getId() == id) {
	            return element;
	        }
	    }

	    throw new InvalidAccessException("Kein Element mit der ID " + id + " gefunden.");
	}
	
}
