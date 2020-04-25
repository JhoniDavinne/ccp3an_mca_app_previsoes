package br.usjt.PrevisoesDoTempo.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PrevisoesDoTempo implements Serializable{
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue
		private Long id;
		private String 	semana;
		private Double 	tempMin;
		private Double 	tempMax;
		private Integer umi;
		private String 	descricao;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getSemana() {
			return semana;
		}
		public void setSemana(String semana) {
			this.semana = semana;
		}
		public Double getTempMin() {
			return tempMin;
		}
		public void setTempMin(Double tempMin) {
			this.tempMin = tempMin;
		}
		public Double getTempMax() {
			return tempMax;
		}
		public void setTempMax(Double tempMax) {
			this.tempMax = tempMax;
		}
		public Integer getUmi() {
			return umi;
		}
		public void setUmi(Integer umi) {
			this.umi = umi;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDesc(String descricao) {
			this.descricao = descricao;
		}

		

	}


