package com.example.project;
public class run{
    public static void main(String[] args) {
        int rows = 12;
        String expectedDecrypted = "s c tin stw=ieat  aros = hsehslolrg=et ytipf en=r m ih  sdi=eha,wtryinh=ht t  ua ut.TiIhp,opt yh w gohY aIrc. ”its oh euyetrsr?tw,vmtns  as  se roiethpetn ye xrs acoe,rvye’umrinzyeol umecr invpnoo espsti  otyts  iit,o   I rl csyteet yolt ernhsa.afaIddeitahnm m n V  eto gs.ay gmc  tn e m.na yoiiAns ti llg g“orliwIle hn  el o atsguswgiyr. aiuo’enfogodrhortnelj dlethci vune up tS aAferlostl ,    alweeA?he\"ea i dl yst.mnewy  .rrae nl eotngaectopehs’onhraegost niu cfl el latho   mpedeca o,yu'  ne ldtemoIyeafIue m y nn   pbs n ,ao,o.o iroftM sT)po o ie or 8 tsfe n.ne.1e i l,ad ge0hghdirletns2tntemeptaio( i tsv uhfl fokc eelw  rlGneawll yoaa il otogmtWh.hltHtpn    ntou i ipeygo cp\"lyoaktniu    ldniiitoes.gg slntcyvetnnm  iae 'osiiaysfnrhudiys l’nirgo soaIptImouy.ene mi ico .rnr)i :l hs. acrstsestesl na ar dlnil,iWdheyeAohin  lwgbe ttwrgyu n n.s  ontowe, e tybiicovetseuebmn nAvIihbhuoiIk-i dt Ttcf   v.a . sen,I?rtrhe. bIs“musatser  e asipirbus:n.  x we oisodIoea vny rto t  ,ia deso. osnncolg g.ht’eu trnx .g th t oeiryueIteaowvseaos  hhd A tsna.dtw e(la eesn  oh leI ceagttT\"ar s i np  . gdalkmiet.th lhlsoccuyiteu i tncol ihogwraaabpnWthn a l apo“ sieetao u  r eflsbtmst.orbica  ' cefO l lneIdas  y d el o ps.r,nshbtooaieeda'waaftlhrve t nh  lteeksisuwelo h ce r  hlcg teioee.ti nsahltdr. wli’hcl ia.n lottnens waeidi ubwntohhw  g  ooantt mwntldch   daoifl  t,rhl nreuee uetrI ulfsneotio ds  rosysww.nnste o a  eAeiuvghlfeem   bintl nh .,e ni egotgeyfguhetn  nmlin tb iy,iallise lwlepsa himslonmp ufthoy'ro oeqIotsaIg tthe n  w  eust . dtltsho  dene'auithtletwrn B  tultiohsl nmioaunnsil.o'Wb bik  iliI asif lnwat . er elu na,dkvtsviFeoltnniseaw\"rsusuirich  erpaohrdr I.heoerta un rtpPla  eor.e     nybsoyw,r.toen ebcosepAgvinr rpavl  eta ne wee.o scsemy nhttte tr mt  a ’dsidt asyhen e lahhamtno,c,ihtww  odtrehti  fsy iutc wrtowrs oi l ei oermsneleb dnveoeihasm,ekegrRfTcrere  nf    emenore .s?Ivet hovnein irhnwfAus e.n gi   rrehtutu es. ests aasnes,vr iehliocdtieexhts  reinvcet  dyue uin  e,llond nioeserns aeustcocooeeeh   nhnw rnrtsdeate e oD iezl lehhy ehniaeohtgr?vTeebriT ueda ps av movns.p n  .'nee salae,dIe  ouhlcrtl\" tttl a esr taa us Iheo.ohhrc’d tuwdntweltlt q l   daauasnereoorchohaohorrto wwt ctwae  e   g    h,nlwyynfeee uipoeooovhreo mnhjl atehyeikt  ss ht ds  esr nT ka udmaaoi msmaon  eta.aa  yasdy td  es  gn eslIIb’o,nAyrur   tDsi\"meso..ti rr  h weys .eb.l o rlu.tg elmteulmeantraa hte rhiIu  dtujsutf tnIe f et  ”aI de ocudy.n“.egetifeme  denh f p sn.lnatsieppra\"r h grloaem.oecrecbtnvuewr olaassihB aof sn  n  e t e ioyuddhs ghtahl nlterntatwplau cei hs mutofiwcstueifshofoin snserS ipfre o te sr iura dadsrcerTa elrngeahc wfhugungSta.aoto  in  sg   caIhe.e nmnm   Tvsvmiao’I.. Aeaan iI .ml ch eIt ,.oldr It c.snrAnuI h.eeeef ao .gyrsnv s s.ditipoigAseeoridatgn nRuofl ls i,e sg ael nmdzrs suhoxeoeioir’qtciecctf ete  sb ni stInnf  eacnia iiolsrl ohe.   liaawitrsdpka  Bot gsnen ts lin eatihiyyltoel srt ulee he, bitgtfptthsl Wa c mc toae“huegoareaih wofnC onhtt” yri ofocn .y enht n ennlePec g ,soonr vuenlns ioe emgiiiest he  acaa aatw dorifpnwvu  oouf  a lbdlotoioe ta nlG crthsestai";
        String actual = Encryptor.decryptMessage(expectedDecrypted, rows);
        System.out.println(actual);

    }

    public static void print(String[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}