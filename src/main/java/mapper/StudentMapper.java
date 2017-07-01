package mapper;

import org.apache.ibatis.annotations.Param;

import entity.StudentEntity;

import java.util.Set;

public interface StudentMapper {

	public StudentEntity getStudentById(int id);

	public int addStudent(StudentEntity student);

	public int updateStudentName(@Param("name") String name, @Param("id") int id);

	public StudentEntity getStudentByIdWithClassInfo(int id);
}
