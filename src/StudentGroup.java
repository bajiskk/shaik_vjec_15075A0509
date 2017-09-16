import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		int index = this.students.length;
		for (Student student: students
			 ) {
			this.students[index++] = student;
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here

		return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalArgumentException {
		// Add your implementation here
		if(student == null || index < 0 || index >= students.length)
		{
			throw new IllegalArgumentException("Students null");
		}
		else
		{
			this.students[index] = student;
		}
	}

	@Override
	public void addFirst(Student student) throws IllegalArgumentException{
		// Add your implementation here
		if(student == null )
			throw new IllegalArgumentException("Student  null");
		else {
			for (int i = this.students.length; i > 0; i--) {
				this.students[i] = this.students[i - 1];
			}
			this.students[0] = student;
		}
	}

	@Override
	public void addLast(Student student) throws IllegalArgumentException {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException("Student  null");
		else {
			int index = this.students.length;
			this.students[index] = student;
		}
	}

	@Override
	public void add(Student student, int index) throws IllegalArgumentException {
		// Add your implementation here
		if(student == null || index <0 || index >= this.students.length)
			throw new IllegalArgumentException("Student  null");
		else {
			for (int i = this.students.length; i > index; i--) {
				this.students[i] = this.students[i - 1];
			}
			this.students[index] = student;
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if( index <0 || index >= this.students.length)
			throw new IllegalArgumentException("Student  null");
		else {
			int indexArr = this.students.length -1 ;
			for (int i = index; i<indexArr; i++) {
				this.students[i] = this.students[i + 1];
			}
			this.students[indexArr] = null;
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if( student == null)
			throw new IllegalArgumentException("Student  null");
		else {
			int indexArr = this.students.length - 1 ;
			int index = 0 ;
			for(int i=0; i<this.students.length; i++)
			{
				if(this.students[i] == student)
					index = i;
				break;
			}
			for (int i = index; i<indexArr; i++) {
				this.students[i] = this.students[i + 1];
			}
			this.students[indexArr] = null;
		}
	}


	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if( index <0 || index >= this.students.length)
			throw new IllegalArgumentException("Student  null");
		else {
			int indexArr = this.students.length ;
			index++;
			for (int i = index; i<indexArr; i++) {
				this.students[i] = null;
			}

		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if( student == null)
			throw new IllegalArgumentException("Student  null");
		else {

			int index = 0;
			int tillThis = this.students.length;
			for(int i=0; i<tillThis; i++)
			{
				if(this.students[i] == student)
					index = i;
				break;
			}
			index ++;
			for (int i = index; i<tillThis; i++) {
				this.students[i]= null;
			}

		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if( index <0 || index >= this.students.length)
			throw new IllegalArgumentException("Student  null");
		else {

		}


	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
