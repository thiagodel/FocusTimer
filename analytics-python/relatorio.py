import streamlit as st
import pandas as pd
import  numpy as np

st.set_page_config(
    page_title= "Relatório de Análise de Dados",
    layout= "Wide"
)

@st.cache_data 
def carregar_dados()

 return df

 dados = {
    'data': pd.date_range('2024-01-01', periods=100, freq='D'),
    'valor': np.random.randint ('100, 1000, 100'),
    'usuarios': np.random.randint('50,500,100')
 }
    

