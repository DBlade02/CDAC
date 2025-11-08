using Microsoft.AspNetCore.Mvc;
using StudentDetail.Models;
using System.Linq;

namespace StudentDetail.Controllers
{
    public class StudentController : Controller
    {
        // In-memory storage for demo (process-lifetime). Replace with DB/EF in real app.
        private static readonly List<Student> _students = new();

        // GET: /Student/Index
        [HttpGet]
        public IActionResult Index()
        {
            var vm = new StudentPageViewModel
            {
                Students = _students.OrderBy(s => s.RollNo).ToList()
            };
            return View(vm);
        }

        // POST: /Student/Index
        [HttpPost]
        [ValidateAntiForgeryToken]
        public IActionResult Index(StudentPageViewModel vm)
        {
            // server-side validation: ModelState on vm.NewStudent
            if (!ModelState.IsValid)
            {
                // redisplay with validation messages and existing list
                vm.Students = _students.OrderBy(s => s.RollNo).ToList();
                return View(vm);
            }

            // check uniqueness of roll number
            if (_students.Any(s => s.RollNo == vm.NewStudent.RollNo))
            {
                ModelState.AddModelError(nameof(vm.NewStudent.RollNo), "Roll number already exists.");
                vm.Students = _students.OrderBy(s => s.RollNo).ToList();
                return View(vm);
            }

            // add student
            _students.Add(new Student
            {
                RollNo = vm.NewStudent.RollNo,
                Name = vm.NewStudent.Name,
                Marks1 = vm.NewStudent.Marks1,
                Marks2 = vm.NewStudent.Marks2,
                Marks3 = vm.NewStudent.Marks3
            });

            // PRG pattern: redirect after post to avoid duplicate submissions
            TempData["Message"] = $"Student {vm.NewStudent.Name} added.";
            return RedirectToAction(nameof(Index));
        }

        // Optional: delete action (illustration)
        [HttpPost]
        [ValidateAntiForgeryToken]
        public IActionResult Delete(int rollNo)
        {
            var s = _students.FirstOrDefault(x => x.RollNo == rollNo);
            if (s != null) _students.Remove(s);
            TempData["Message"] = s == null ? "Student not found." : $"Student {s.Name} removed.";
            return RedirectToAction(nameof(Index));
        }
    }
}
