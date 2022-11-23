package tn.esprit.soulaymajeribi.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RendezVous implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRDV;
    @Temporal(TemporalType.DATE)
    // @ApiModelProperty(required = true, dataType="date")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dateRdv;
    private String remarque;

    @ManyToOne
    private Medecin medecin;

    @ManyToOne
    private Patient patient;
}

