package day23;

public class UpDown {
 private String name;
 private int count;

  public UpDown(String name, int count) {
	this.name = name;
	this.count = count;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

@Override
public String toString() {
	return "UpDown [name=" + name + ", count=" + count + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + count;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	UpDown other = (UpDown) obj;
	if (count != other.count)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
  
  
  
}
