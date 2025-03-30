package org.example.Lesson_2

fun main() {
    val recruiter: Byte = 50
    val salaryRecruit: Int = 30000
    val intern: Byte = 30
    val salaryIntern: Int = 20000

    val allSalaryRecruit: Int = recruiter * salaryRecruit
    val allSalary: Int = allSalaryRecruit + intern * salaryIntern
    val averageSalary: Int = allSalary / (recruiter + intern)

    println(allSalaryRecruit)
    println(allSalary)
    println(averageSalary)

}