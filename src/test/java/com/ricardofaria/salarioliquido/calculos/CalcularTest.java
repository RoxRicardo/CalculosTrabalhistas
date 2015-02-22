package com.ricardofaria.salarioliquido.calculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ricardofaria.salarioliquido.model.Ferias;
import com.ricardofaria.salarioliquido.model.Ferias.TIPO_FERIAS;
import com.ricardofaria.salarioliquido.model.Salario;

public class CalcularTest {
	
	private static final float VALOR_SALARIO_MINIMO = 788.00f;

	private Calcular calcular;
	
	@Before
	public void init() {
		this.calcular = new Calcular();
	}
	
	@Test
	public void testCalcularSalarioMinimo() {
		float salarioBruto = VALOR_SALARIO_MINIMO;
		
		Salario salario = calcular.calcularSalario(salarioBruto); 
		
		assertEquals(63.04f, salario.getDescontoInss(), 0.01);
		assertEquals(0.0f, salario.getDescontoIrpf(), 0.01);
		assertEquals(724.96f, salario.getSalarioLiquido(), 0.01);
	}
	
	@Test
	public void testCalcularSalario1500() {
		float salarioBruto = 1500.00f;
		int quantidadeDependentes = 0;
		
		Salario salario = calcular.calcularSalario(salarioBruto, quantidadeDependentes); 
		
		assertEquals(135.00f, salario.getDescontoInss(), 0.01);
		assertEquals(0.0f, salario.getDescontoIrpf(), 0.01);
		assertEquals(1365.00f, salario.getSalarioLiquido(), 0.01);
	}
	
	@Test
	public void testCalcularSalario2000() {
		float salarioBruto = 2000.00f;
		int quantidadeDependentes = 0;
		
		Salario salario = calcular.calcularSalario(salarioBruto, quantidadeDependentes); 
		
		assertEquals(180.00f, salario.getDescontoInss(), 0.01);
		assertEquals(0.0f, salario.getDescontoIrpf(), 0.01);
		assertEquals(1820.0f, salario.getSalarioLiquido(), 0.01);
	}
	
	@Test
	public void testCalcularSalario2500() {
		float salarioBruto = 2500.00f;
		int quantidadeDependentes = 0;
		
		Salario salario = calcular.calcularSalario(salarioBruto, quantidadeDependentes); 
		
		assertEquals(275.00f, salario.getDescontoInss(), 0.01);
		assertEquals(26.76f, salario.getDescontoIrpf(), 0.01);
		assertEquals(2198.24f, salario.getSalarioLiquido(), 0.01);
	}
	
	@Test
	public void testCalcularSalario3000() {
		float salarioBruto = 3000.00f;
		int quantidadeDependentes = 0;
		
		Salario salario = calcular.calcularSalario(salarioBruto, quantidadeDependentes); 
		
		assertEquals(330.00f, salario.getDescontoInss(), 0.01);
		assertEquals(60.13f, salario.getDescontoIrpf(), 0.01);
		assertEquals(2609.87f, salario.getSalarioLiquido(), 0.01);
	}
	
	@Test
	public void testCalcularSalario3500() {
		float salarioBruto = 3500.00f;
		int quantidadeDependentes = 0;
		
		Salario salario = calcular.calcularSalario(salarioBruto, quantidadeDependentes); 
		
		assertEquals(385.00f, salario.getDescontoInss(), 0.01);
		assertEquals(117.14f, salario.getDescontoIrpf(), 0.01);
		assertEquals(2997.86f, salario.getSalarioLiquido(), 0.01);
	}
	
	@Test
	public void testCalcularSalario4000() {
		float salarioBruto = 4000.00f;
		int quantidadeDependentes = 0;
		
		Salario salario = calcular.calcularSalario(salarioBruto, quantidadeDependentes); 
		
		assertEquals(440.00f, salario.getDescontoInss(), 0.01);
		assertEquals(183.89f, salario.getDescontoIrpf(), 0.01);
		assertEquals(3376.11f, salario.getSalarioLiquido(), 0.01);
	}
	
	@Test
	public void testCalcularSalario4500() {
		float salarioBruto = 4500.00f;
		int quantidadeDependentes = 0;
		
		Salario salario = calcular.calcularSalario(salarioBruto, quantidadeDependentes); 
		
		assertEquals(495.00f, salario.getDescontoInss(), 0.01);
		assertEquals(271.03f, salario.getDescontoIrpf(), 0.01);
		assertEquals(3733.97f, salario.getSalarioLiquido(), 0.01);
	}
	
	@Test
	public void testCalcularSalario5000() {
		float salarioBruto = 5000.00f;
		int quantidadeDependentes = 0;
		
		Salario salario = calcular.calcularSalario(salarioBruto, quantidadeDependentes); 
		
		assertEquals(513.01f, salario.getDescontoInss(), 0.01);
		assertEquals(379.47f, salario.getDescontoIrpf(), 0.01);
		assertEquals(4107.52f, salario.getSalarioLiquido(), 0.01);
	}
	
	@Test
	public void testCalcularFeriasSalarioMinimo() {
		float salarioBruto = VALOR_SALARIO_MINIMO;
		Ferias ferias = calcular.calcularFerias(salarioBruto);
		
		
		assertEquals(262.67, ferias.getValorFerias(), 0.01);
		assertEquals(84.05, ferias.getDescontoInss(), 0.01);
		assertEquals(0.0, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(966.62, ferias.getFeriasLiquidas(), 0.01);
	}
	
	@Test
	public void testCalcularFerias1500() {
		float salarioBruto = (float) 1500.00;
		int dependentes = 0;
		Ferias ferias = calcular.calcularFerias(salarioBruto, dependentes);
		
		
		assertEquals(500.0, ferias.getValorFerias(), 0.01);
		assertEquals(180.0, ferias.getDescontoInss(), 0.01);
		assertEquals(0.0, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(1819.99, ferias.getFeriasLiquidas(), 0.01);
	}
	
	@Test
	public void testCalcularFerias2000() {
		float salarioBruto = 2000.00f;
		int dependentes = 0;
		
		Ferias ferias = calcular.calcularFerias(salarioBruto, dependentes);
		
		assertEquals(666.67, ferias.getValorFerias(), 0.01);
		assertEquals(293.33, ferias.getDescontoInss(), 0.01);
		assertEquals(37.88, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(2335.45, ferias.getFeriasLiquidas(), 0.01);	
	}
	
	@Test
	public void testCalcularFerias2500() {
		float salarioBruto = 2500.00f;
		
		Ferias ferias = calcular.calcularFerias(salarioBruto);
		
		assertEquals(833.33, ferias.getValorFerias(), 0.01);
		assertEquals(366.67, ferias.getDescontoInss(), 0.01);
		assertEquals(94.88, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(2871.77, ferias.getFeriasLiquidas(), 0.01);	
	}
	
	@Test
	public void testCalcularFerias3000() {
		float salarioBruto = 3000.00f;
		Ferias ferias = calcular.calcularFerias(salarioBruto);
		
		assertEquals(1000.00, ferias.getValorFerias(), 0.01);
		assertEquals(440.00, ferias.getDescontoInss(), 0.01);
		assertEquals(183.88, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(3376.10, ferias.getFeriasLiquidas(), 0.01);	
	}
	
	@Test
	public void testCalcularFerias3500() {
		float salarioBruto = 3500.00f;
		Ferias ferias = calcular.calcularFerias(salarioBruto);
		
		assertEquals(1166.67, ferias.getValorFerias(), 0.01);
		assertEquals(513.01, ferias.getDescontoInss(), 0.01);
		assertEquals(304.47, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(3849.18, ferias.getFeriasLiquidas(), 0.01);	
	}
	
	@Test
	public void testCalcularFerias4000() {
		float salarioBruto = 4000.00f;
		Ferias ferias = calcular.calcularFerias(salarioBruto);
		
		assertEquals(1333.33, ferias.getValorFerias(), 0.01);
		assertEquals(513.01, ferias.getDescontoInss(), 0.01);
		assertEquals(462.26, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(4358.06, ferias.getFeriasLiquidas(), 0.01);	
	}
	
	@Test
	public void testCalcularFerias4500() {
		float salarioBruto = 4500.00f;
		Ferias ferias = calcular.calcularFerias(salarioBruto);
		
		assertEquals(1500.00, ferias.getValorFerias(), 0.01);
		assertEquals(513.01, ferias.getDescontoInss(), 0.01);
		assertEquals(645.59, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(4841.39, ferias.getFeriasLiquidas(), 0.01);	
	}
	
	@Test
	public void testCalcularFerias5000() {
		float salarioBruto = 5000.00f;
		Ferias ferias = calcular.calcularFerias(salarioBruto);
		
		assertEquals(1666.67, ferias.getValorFerias(), 0.01);
		assertEquals(513.01, ferias.getDescontoInss(), 0.01);
		assertEquals(828.92, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(5324.72, ferias.getFeriasLiquidas(), 0.01);	
	}

	@Test
	public void testCalcular20DiasDeFeriasSalarioMinimo() {
		float salarioBruto = VALOR_SALARIO_MINIMO;
		Ferias ferias = calcular.calcularFerias(salarioBruto, TIPO_FERIAS.DIAS_20);
		
		
		assertEquals(175.11, ferias.getValorFerias(), 0.01);
		assertEquals(56.04, ferias.getDescontoInss(), 0.01);
		assertEquals(0.0, ferias.getDescontoIrpf(), 0.01);
		assertEquals(350.23, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(994.63, ferias.getFeriasLiquidas(), 0.01);
	}
	
	@Test
	public void testCalcular20DiasDeFerias1500() {
		float salarioBruto = (float) 1500.00;
		int dependentes = 0;
		Ferias ferias = calcular.calcularFerias(salarioBruto, dependentes, TIPO_FERIAS.DIAS_20);
		
		assertEquals(333.33, ferias.getValorFerias(), 0.01);
		assertEquals(106.67, ferias.getDescontoInss(), 0.01);
		assertEquals(0.0, ferias.getDescontoIrpf(), 0.01);
		assertEquals(666.66, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(1893.33, ferias.getFeriasLiquidas(), 0.01);
	}
	
	@Test
	public void testCalcular20DiasDeFerias2000() {
		float salarioBruto = 2000.00f;
		
		Ferias ferias = calcular.calcularFerias(salarioBruto, TIPO_FERIAS.DIAS_20);
		
		assertEquals(444.44, ferias.getValorFerias(), 0.01);
		assertEquals(160.00, ferias.getDescontoInss(), 0.01);
		assertEquals(0.00, ferias.getDescontoIrpf(), 0.01);
		assertEquals(888.89, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(2506.67, ferias.getFeriasLiquidas(), 0.01);	
	}
	
	@Test
	public void testCalcular20DiasDeFerias2500() {
		float salarioBruto = 2500.00f;
		
		Ferias ferias = calcular.calcularFerias(salarioBruto);
		
		assertEquals(833.33, ferias.getValorFerias(), 0.01);
		assertEquals(366.67, ferias.getDescontoInss(), 0.01);
		assertEquals(94.88, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(2871.77, ferias.getFeriasLiquidas(), 0.01);	
	}
	
	@Test
	public void testCalcular20DiasDeFerias3000() {
		float salarioBruto = 3000.00f;
		Ferias ferias = calcular.calcularFerias(salarioBruto);
		
		assertEquals(1000.00, ferias.getValorFerias(), 0.01);
		assertEquals(440.00, ferias.getDescontoInss(), 0.01);
		assertEquals(183.88, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(3376.10, ferias.getFeriasLiquidas(), 0.01);	
	}
	
	@Test
	public void testCalcular20DiasDeFerias3500() {
		float salarioBruto = 3500.00f;
		Ferias ferias = calcular.calcularFerias(salarioBruto);
		
		assertEquals(1166.67, ferias.getValorFerias(), 0.01);
		assertEquals(513.01, ferias.getDescontoInss(), 0.01);
		assertEquals(304.47, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(3849.18, ferias.getFeriasLiquidas(), 0.01);	
	}
	
	@Test
	public void testCalcular20DiasDeFerias4000() {
		float salarioBruto = 4000.00f;
		Ferias ferias = calcular.calcularFerias(salarioBruto);
		
		assertEquals(1333.33, ferias.getValorFerias(), 0.01);
		assertEquals(513.01, ferias.getDescontoInss(), 0.01);
		assertEquals(462.26, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(4358.06, ferias.getFeriasLiquidas(), 0.01);	
	}
	
	@Test
	public void testCalcular20DiasDeFerias4500() {
		float salarioBruto = 4500.00f;
		Ferias ferias = calcular.calcularFerias(salarioBruto);
		
		assertEquals(1500.00, ferias.getValorFerias(), 0.01);
		assertEquals(513.01, ferias.getDescontoInss(), 0.01);
		assertEquals(645.59, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(4841.39, ferias.getFeriasLiquidas(), 0.01);	
	}
	
	@Test
	public void testCalcular20DiasDeFerias5000() {
		float salarioBruto = 5000.00f;
		Ferias ferias = calcular.calcularFerias(salarioBruto);
		
		assertEquals(1666.67, ferias.getValorFerias(), 0.01);
		assertEquals(513.01, ferias.getDescontoInss(), 0.01);
		assertEquals(828.92, ferias.getDescontoIrpf(), 0.01);
		assertEquals(0.0, ferias.getAbonoPecuniario(), 0.01);
		assertEquals(5324.72, ferias.getFeriasLiquidas(), 0.01);	
	}
	

}