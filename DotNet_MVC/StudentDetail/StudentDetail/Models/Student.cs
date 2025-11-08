using System.ComponentModel.DataAnnotations;

namespace StudentDetail.Models
{
    public class Student
    {
        [Required]
        [Display(Name = "Roll Number")]
        public int RollNo { get; set; }

        [Required]
        [StringLength(100, MinimumLength = 2)]
        public string Name { get; set; } = string.Empty;

        [Range(0, 100)]
        [Display(Name = "Marks 1")]
        public int Marks1 { get; set; }

        [Range(0, 100)]
        [Display(Name = "Marks 2")]
        public int Marks2 { get; set; }

        [Range(0, 100)]
        [Display(Name = "Marks 3")]
        public int Marks3 { get; set; }

        // convenience helpers
        public int Total => Marks1 + Marks2 + Marks3;
        public double Percentage => Total / 3.0;
    }
}
