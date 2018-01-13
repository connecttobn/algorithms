package algorithms.search;

/**Linear Search Algorithm
 * @author sunil.bn 
 * @since 1st Jan 2018
 */

class LinearSearch
{
    
    /** Integer Search algorithm returns index if the item is found
     * @param array Array of integers
     * @param x Element to be searched
     * @return index if found, else -1.
     */
    static public int search(int array[], int x)
    {
    	int n = array.length;
        for (int i = 0; i < n; i++)
        {
            // Return the index of the element if the element is found
            if (array[i] == x)
                return i;
        }
        // return -1 if the element is not found
        return -1;
    }
}
