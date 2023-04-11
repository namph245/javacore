package collection.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String maHocSinh;
    private String tenHocSinh;
    private double diemTrungBinh;
}
