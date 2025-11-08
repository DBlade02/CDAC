using System.Collections.Generic;

namespace StudentDetail.Models
{
    public class StudentPageViewModel
    {
        public Student NewStudent { get; set; } = new Student();
        public List<Student> Students { get; set; } = new List<Student>();
        public string? Message { get; set; }
    }
}
