-- 1. Liste os nomes dos candidatos cujo partido possui orientação "Centro".

select tc.nocandidato, tbo.noorientacao
  from tbcandidato tc
 inner join tbpartido tp on tc.copartido = tp.copartido
 inner join tborientacao tbo on tp.coorientacao = tbo.coorientacao
 where tbo.noorientacao like 'Centro';

-- 2. Liste os nomes dos partidos e as respectivas quantidades de candidatos
-- associados.

select SgPartido, count(NoCandidato)
  from TbPartido as p
 inner join TbCandidato as c on p.CoPartido = c.CoPartido
 group by SgPartido;

-- 3. Agora, liste apenas os partidos cuja a quantidade de candidatos associados
-- seja maior que 5.

select SgPartido, count(NoCandidato)
  from TbPartido as p
 inner join TbCandidato as c on p.CoPartido = c.CoPartido
 group by SgPartido
having count(NoCandidato) > 5;

-- 4. Selecione os candidatos que receberam mais votos do que a média
-- de votos de todos os candidatos.

select tc.nocandidato, SUM(tv.qtvotos) AS total_votos
  from tbcandidato tc
 inner join tbvotos tv on tc.nucandidato = tv.nucandidato
 group by tc.nucandidato, tc.nocandidato
having SUM(tv.qtvotos) > (select AVG(total_por_candidato)
                            from (select SUM(tbv.qtvotos) as total_por_candidato
                                    from tbvotos tbv
                                   group by tbv.nucandidato));

-- 5. Mostre os candidatos que não receberam votos em nenhuma zona.

select tc.nocandidato, SUM(tv.qtvotos)
  from tbcandidato tc
  left join tbvotos tv on tc.nucandidato = tv.nucandidato
 group by tc.nucandidato, tc.nocandidato
having SUM(tv.qtvotos) is null;

-- 6. Liste os partidos que possuem, pelo menos, um candidato associado.

select tp.nopartido, SUM(tc.nucandidato) as numero_de_candidato
  from tbpartido tp
  left join tbcandidato tc on tp.copartido = tc.copartido
 group by tp.copartido
having SUM(tc.nucandidato) is not null;

--Feita pela IA: INNER JOIN automaticamente "expulsa" partidos que não têm candidatos.
-- OBS:DISTINCT serve para o nome do partido não repetir para cada candidato que ele tiver

SELECT DISTINCT tp.NoPartido
  FROM TbPartido tp
 INNER JOIN TbCandidato tc ON tp.CoPartido = tc.CoPartido;

-- 7. Agora, liste (se houver) os partidos que não há candidatos associados.

select tp.nopartido, count(tc.nucandidato)
  from tbpartido tp
  left join tbcandidato tc on tp.copartido = tc.copartido
 group by tp.copartido, tp.nopartido
having count(tc.nucandidato) = 0;

-- 8. Liste os partidos que não possuem orientação política.

select tp.nopartido
  from tbpartido tp
  left join tborientacao tbo on tp.coorientacao = tbo.coorientacao
 group by tp.copartido, tbo.coorientacao
having tbo.coorientacao is null;

--Feita pela IA:
select tp.nopartido
  from tbpartido tp
 where tp.coorientacao is null;