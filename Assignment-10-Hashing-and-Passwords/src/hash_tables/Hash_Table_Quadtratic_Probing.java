/**
 * 
 */
package hash_tables;

import java.util.ArrayList;

/**
 * Hash table implementation that uses MD5 hashing and probes collisions by
 * adding quadratic values.
 * 
 * @author Mark Van der Merwe and Andrew Haas
 *
 */
public class Hash_Table_Quadtratic_Probing<KeyType, ValueType> extends Hash_Table_Linear_Probing<KeyType, ValueType> {

	public Hash_Table_Quadtratic_Probing(int initial_capacity) {
		super(initial_capacity);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Quadratic probing method, moves our counter forward by increasing amounts each time.
	 */
	@Override
	public int probe(int index) {
		this.probeCount++;
		return (int) (index + Math.pow(this.probeCount, 2));
	}
	
}